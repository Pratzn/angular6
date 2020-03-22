package pratz.tech.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import pratz.tech.controller.v1.api.ContentApiDelegate;
import pratz.tech.controller.v1.api.UsersApiDelegate;
import pratz.tech.controller.v1.model.Content;
import pratz.tech.controller.v1.model.User;

import java.util.List;
import java.util.Optional;

public class ServiceImpl implements UsersApiDelegate, ContentApiDelegate {

    @Override
    public ResponseEntity<Content> createContent(Content body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteContent(String contentId) {
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

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<User> createUser(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUser(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> getusers() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(String userId, User body) {
        return null;
    }
}
