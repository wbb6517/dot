package org.example.tools.word2pdf;

import com.aspose.words.Shape;
import com.aspose.words.*;
import org.springframework.core.io.ClassPathResource;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//work转pdf工具类
public class WordToPdfUtil {
    private static boolean license = false;

    public static void main(String[] args) {
        WordToPdfUtil wordToPdfUtil = new WordToPdfUtil();
        try {
            wordToPdf("C:\\Users\\30285\\Downloads\\YX工程测试项目可行性研究地质报告.doc","C:\\Users\\30285\\Downloads\\YX工程测试项目可行性研究地质报告.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 将Word文档转换为PDF格式-无水印
     * 使用Apose库实现文档转换功能，需要先加载License以激活无水印转换。
     *
     * @param wordPath Word文档的路径，包括文件名和扩展名。
     * @param pdfPath 生成的PDF文档的路径，包括文件名和扩展名。
     * @throws Exception 如果转换过程中发生错误，将抛出异常。
     * @return 转换失败时返回null，成功时返回非null值。
     */
    public static String wordToPdf(String wordPath, String pdfPath) throws Exception {
        FileOutputStream os = null;
        try {
            // 从classpath中加载Apose的License文件，以启用无水印转换。
            // 凭证 不然切换后有水印
            InputStream is = new ClassPathResource("/license.xml").getInputStream();

//            License aposeLic = new License();
//            aposeLic.setLicense(is);
//            license = true;
//            // 检查License是否成功加载，如果未成功，则输出错误信息并中止转换。
//            if (!license) {
//                System.out.println("License验证不通过...");
//                return null;
//            }
            // 创建一个空的PDF文件，准备写入转换后的内容。
            //生成一个空的PDF文件
            File file = new File(pdfPath);
            os = new FileOutputStream(file);
            // 创建一个Document对象，指定要转换的Word文档路径。
            //要转换的word文件
            Document doc = new Document(wordPath);
            // 将Word文档保存为PDF格式，写入到之前创建的PDF文件中。
            doc.save(os, SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 确保关闭文件输出流。
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }


    /**
     * 将指定文件转换为PDF格式，并添加水印。
     *
     * @param toFilePath 目标文件夹路径，用于保存转换后的PDF文件。
     * @param fileName 原始文件名。
     * @param type 原始文件类型，支持".doc"和".docx"。
     * @return 转换后的PDF文件名，如果类型不支持则返回null。
     * @throws Exception 如果转换过程中发生错误，则抛出异常。
     */
    public static String file2pdf(String toFilePath, String fileName, String type ) throws Exception {
        String htmFileName;
        // 根据原始文件类型确定转换后的PDF文件名。
        //获取转换成PDF之后文件名
        if(".doc".equals(type)){
            htmFileName = fileName+".pdf";
        }else if(".docx".equals(type)){
            htmFileName = fileName+".pdf";
        }else{
            // 如果不支持的文件类型，则返回null。
            return null;
        }
        // 创建转换后的PDF文件对象。
        //通过转换之后的PDF文件名,创建PDF文件
        File htmlOutputFile = new File(toFilePath + File.separatorChar + htmFileName);
        // 获取文件输出流，用于写入转换后的PDF文件。
        //获取文件输出流
        FileOutputStream os = new FileOutputStream(htmlOutputFile);
        // 创建Doc文档对象模型，用于读取原始文档并进行转换。
        //获取Doc文档对象模型
        Document doc = new Document(toFilePath+ File.separatorChar + fileName+type);
        // 为文档添加水印文本。
        //为doc文档添加水印
        insertWatermarkText(doc, "");
        // 将文档保存为PDF格式，并写入到输出流中。
        //将doc文旦转换成PDF文件并输出到之前创建好的pdf文件中
        doc.save(os, SaveFormat.PDF);
        // 关闭文件输出流。
        //关闭输出流
        if(os!=null){
            os.close();
        }
        // 返回转换后的PDF文件名。
        return htmFileName;
    }

    /**
     * 为Word文档添加文本水印。
     *
     * @param doc 要添加水印的Word文档对象。
     * @param watermarkText 水印文本内容。
     * @throws Exception 如果操作文档过程中发生错误，则抛出异常。
     */
    private static void insertWatermarkText(Document doc, String watermarkText) throws Exception {
        // 创建一个文本形状对象作为水印
        Shape watermark = new Shape(doc, ShapeType.TEXT_PLAIN_TEXT);
        // 设置水印文本内容
        watermark.getTextPath().setText(watermarkText);
        // 设置水印字体及大小
        watermark.getTextPath().setFontFamily("宋体");
        // 设置水印的宽度和高度
        watermark.setWidth(500);
        watermark.setHeight(100);
        // 设置水印的旋转角度
        watermark.setRotation(-40);
        // 设置水印的颜色
        watermark.getFill().setColor(Color.lightGray);
        watermark.setStrokeColor(Color.lightGray);
        // 设置水印的位置属性
        watermark.setRelativeHorizontalPosition(RelativeHorizontalPosition.PAGE);
        watermark.setRelativeVerticalPosition(RelativeVerticalPosition.PAGE);
        watermark.setWrapType(WrapType.NONE);
        watermark.setVerticalAlignment(VerticalAlignment.CENTER);
        watermark.setHorizontalAlignment(HorizontalAlignment.CENTER);
        // 创建一个段落对象，用于包含水印形状
        Paragraph watermarkPara = new Paragraph(doc);
        watermarkPara.appendChild(watermark);
        // 遍历文档中的每个节（section），在每个节的主头、首个头和偶数头中插入水印
        for (Section sect : doc.getSections())
        {
            // 在指定类型的头部插入水印
            insertWatermarkIntoHeader(watermarkPara, sect, HeaderFooterType.HEADER_PRIMARY);
            insertWatermarkIntoHeader(watermarkPara, sect, HeaderFooterType.HEADER_FIRST);
            insertWatermarkIntoHeader(watermarkPara, sect, HeaderFooterType.HEADER_EVEN);
        }
        // 提示水印添加完成
        System.out.println("Watermark Set");
    }


    /**
     * 在指定的页面头部插入水印。
     * <p>
     * 本方法用于向指定的页面头部插入一个水印。如果指定类型的头部不存在，则会创建一个新的头部并添加到文档中。
     * 使用深度克隆来确保水印段落在每个页面头部的独立性。
     *
     * @param watermarkPara 水印段落对象，包含水印的文本和格式信息。
     * @param sect 目标节对象，水印将被插入到该节的头部。
     * @param headerType 指定的头部类型，用于获取或创建相应类型的头部。
     * @throws Exception 如果操作失败，抛出异常。
     */
    private static void insertWatermarkIntoHeader(Paragraph watermarkPara, Section sect, int headerType) throws Exception{
        // 根据指定的头部类型获取现有的头部对象，如果不存在则返回null。
        HeaderFooter header = sect.getHeadersFooters().getByHeaderFooterType(headerType);

        // 如果指定类型的头部不存在，则创建一个新的头部对象，并将其添加到节的头部集合中。
        if (header == null)
        {
            header = new HeaderFooter(sect.getDocument(), headerType);
            sect.getHeadersFooters().add(header);
        }

        // 将水印段落深度克隆，并添加到头部对象中，确保每个页面的水印都是独立的。
        header.appendChild(watermarkPara.deepClone(true));
    }

}


