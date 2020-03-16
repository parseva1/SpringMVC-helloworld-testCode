package loveandpeace;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class uploadController {
    @RequestMapping("/testFileUpload")
    public String upload(HttpServletRequest request,MultipartFile upload) throws IOException {
        System.out.println("文件上传执行！");
        // 上传地址
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        // 判断该路径是否存在
        File file = new File(path);
        if (!file.exists()){
            //创建文件夹
            file.mkdirs();
        }
        // 获取上传文件的名称
        String fileName = upload.getOriginalFilename();
        //把名称变为唯一值
        String uuid = UUID.randomUUID().toString().replace("-","");
        fileName = uuid + "_" +fileName;
        upload.transferTo(new File(path,fileName));
        return "success";
    }

    @RequestMapping("/DifServerFileUpload")
    public String upload(MultipartFile upload) throws IOException {
        System.out.println("文件上传执行aac！");
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        fileName = uuid + "_" +fileName;

        String path = "http://localhost:9090/uploads/";
        // 创建客户端对象
        Client client = Client.create();
        // 和图片服务器进行连接
        // fuck
        System.out.println("1");
        WebResource webResource = client.resource(path + fileName);
        System.out.println("2");
        // 上传文件
        webResource.put(upload.getBytes());
        return "success";
    }
}
