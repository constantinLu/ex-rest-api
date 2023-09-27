package controller;


import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @GetMapping("/user")
    String getUser() {
        return "Constantin";
    }

    @GetMapping("v1/users/{id}")
    String getUsers(@PathVariable Long userId) {
        return "Constantin";
    }

    @GetMapping("users/{userId}/addresses/{addressId}")
    String getUserAddress(@PathVariable Long userId, @PathVariable Long addressId) {
        return "User: " + userId + " address" + addressId;
    }

    @GetMapping("/users")
    List<String> userByType(@RequestParam String userType) {
        return switch (userType) {
            case "ADMIN" -> List.of("Constantin", "Cosmina");
            case "USER" -> List.of("Marcel", "Gabriel");
            default -> List.of("ERROR");
        };
    }

    @PostMapping("/users/user")
    String createUser(@RequestBody String userName) {
        return "User created for: " + userName;
    }

    @PutMapping("/users/{userId}/user")
    String editUser(@PathVariable Long userId, @RequestBody String newUserName) {
        return "User updated with for id:" + userId + " with: " + newUserName;
    }

    @PatchMapping("/users/{userId}/user")
    String patchUser(@PathVariable Long userId, @RequestBody String patchedUser) {
        return "User patch for id" + userId + " with: " + patchedUser;
    }

    @DeleteMapping("users/{userId}")
    void deleteUser(@PathVariable Long userId) {
        System.out.println("Delete user with id: " + userId);
    }

    @RequestMapping(value="/users/option", method = RequestMethod.OPTIONS)
    String collectionOptions() {
        return ResponseEntity
                .ok()
                .body("OPTIONS METHOD")
                .getBody();
    }
}
