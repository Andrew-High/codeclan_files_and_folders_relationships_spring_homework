package com.example.homework.components;

import com.example.homework.models.File;
import com.example.homework.models.Folder;
import com.example.homework.models.User;
import com.example.homework.repositories.FileRepository;
import com.example.homework.repositories.FolderRepository;
import com.example.homework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;
    public DataLoader() {

    }
    public void run(ApplicationArguments args) {
        User andrew = new User("Andrew");
        userRepository.save(andrew);
        User steven = new User("Steven");
        userRepository.save(steven);
        User dan = new User("Dan");
        userRepository.save(dan);
        User sam = new User ("Sam");
        userRepository.save(sam);
        User holly = new User("Holly");
        userRepository.save(holly);
        Folder java = new Folder("Java", andrew);
        folderRepository.save(java);
        Folder javascript = new Folder ("Javascript", holly);
        folderRepository.save(javascript);
        Folder python = new Folder ("Python", dan);
        folderRepository.save(python);
        Folder html = new Folder ("HTML", sam);
        folderRepository.save(html);
        Folder css = new Folder ("CSS", sam);
        folderRepository.save(css);
        File oop = new File ("OOP", ".java", 12, java);
        fileRepository.save(oop);
        File react = new File ("React", ".js", 70, javascript);
        fileRepository.save(react);
        File spring = new File ("Spring", ".java", 128, java);
        fileRepository.save(spring);
    }
}
