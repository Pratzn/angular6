package pratz.tech.controller.v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import pratz.tech.controller.v1.api.ContentApiDelegate;
import pratz.tech.controller.v1.api.UsersApiDelegate;
import pratz.tech.controller.v1.model.Content;
import pratz.tech.controller.v1.model.User;
import pratz.tech.repository.ContentRepository;
import pratz.tech.repository.UserRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceImpl implements ContentApiDelegate, UsersApiDelegate {

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<User> createUser(User body) {
        User ret = userRepository.save(body);
        return ResponseEntity.status(201).body(ret);
    }

    @Override
    public ResponseEntity<Void> deleteUser(String userId) {
        userRepository.deleteById(userId);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<User> getUser(String userId) {
        Optional<User> ret = userRepository.findById(userId);
        if(ret.isPresent()){
            return ResponseEntity.ok(ret.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    @Override
    public ResponseEntity<List<User>> getusers() {
        List<User> ret = userRepository.findAll();
        return ResponseEntity.ok(ret);
    }

    @Override
    public ResponseEntity<Void> updateUser(String userId, User body) {
        body.setUserId(userId);
        userRepository.save(body);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Content> createContent(Content body) {
        Content ret = contentRepository.save(body);
        return ResponseEntity.status(201).body(ret);
    }

    @Override
    public ResponseEntity<Void> deleteContent(id contentId) {
        contentRepository.deleteById(contentId);

        return null;
    }

    @Override
    public ResponseEntity<Content> getContent(String contentId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Content>> getContents() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateContent(String contentId, Content body) {
        return null;
    }
}
