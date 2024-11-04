package fa.exp.demodata.Service;

import fa.exp.demodata.Dto.UserDto;
import fa.exp.demodata.Model.User;
import fa.exp.demodata.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    final UserRepository userRepository;
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    public UserDto getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(this::convertToDto).orElse(null);
    }
    private UserDto convertToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getHoTen(),
                user.getGioiTinh(),
                user.getNgaySinh(),
                user.getDienThoai(),
                user.getGmail(),
                user.getCccd(),
                user.getDiaChi(),
                user.getDanToc(),
                user.getTrinhDo(),
                user.getAnh(),
                user.getPassword(),
                user.getTongPhep()
        );
    }
}
