package fa.exp.demodata.Controller;

import fa.exp.demodata.Dto.CustomResponse;
import fa.exp.demodata.Dto.UserDto;
import fa.exp.demodata.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    final UserService userService;

    @GetMapping
    public ResponseEntity<CustomResponse<List<UserDto>>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        CustomResponse<List<UserDto>> response = new CustomResponse<>(
                HttpStatus.OK.value(),
                "Successfully retrieved all users",
                users
        );
        return ResponseEntity.ok(response);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CustomResponse<UserDto>> getUserById(@PathVariable Integer id) {
        UserDto user = userService.getUserById(id);
        if (user != null) {
            CustomResponse<UserDto> response = new CustomResponse<>(
                    HttpStatus.OK.value(),
                    "User found",
                    user
            );
            return ResponseEntity.ok(response);
        } else {
            CustomResponse<UserDto> response = new CustomResponse<>(
                    HttpStatus.NOT_FOUND.value(),
                    "User not found",
                    null
            );
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

}
