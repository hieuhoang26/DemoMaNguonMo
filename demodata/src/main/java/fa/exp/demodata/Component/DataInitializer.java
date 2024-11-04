//package fa.exp.demodata.Component;
//
//import com.github.javafaker.Faker;
//import fa.exp.demodata.Model.User;
//import fa.exp.demodata.Repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//
//@Component
//@RequiredArgsConstructor
//public class DataInitializer implements CommandLineRunner {
//    final UserRepository userRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        Faker faker = new Faker();
//        Random random = new Random();
//        for (int i = 0; i < 9000; i++) {
//            User user = new User();
//            user.setHoTen(faker.name().fullName());
//            user.setGioiTinh(random.nextBoolean() ? "Nam" : "Nữ");
//            user.setNgaySinh(faker.date().birthday(18, 60));
//            user.setDienThoai(faker.phoneNumber().phoneNumber());
//            user.setGmail(faker.internet().emailAddress());
//            user.setCccd(String.valueOf(faker.number().numberBetween(100000000, 999999999)));
//            user.setDiaChi(faker.address().fullAddress());
//            user.setDanToc(faker.demographic().race());
//            user.setTrinhDo(faker.educator().course());
//            user.setAnh(faker.internet().avatar());
//            user.setPassword(faker.internet().password(4, 12));
//            user.setTongPhep(faker.number().numberBetween(0, 30));
//            userRepository.save(user);
//        }
//    }
//}
