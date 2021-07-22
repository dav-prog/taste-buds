//package com.tastebuds.webapp.example.uploadingfiles;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.view.RedirectView;
//
//import java.io.IOException;
//
//@Controller
//public class UserController {
//
//    @Autowired
//    private UserRepository repo;
//
//    @PostMapping("/users/save")
//    public RedirectView saveUser(User user,
//                                 @RequestParam("image") MultipartFile multipartFile) throws IOException {
//
//        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        user.setPhotos(fileName);
//
//        User savedUser = repo.save(user);
//
//        String uploadDir = "user-photos/" + savedUser.getId();
//
//        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//
//        return new RedirectView("/users", true);
//    }
//}
