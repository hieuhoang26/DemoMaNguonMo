package fa.exp.demodata.Dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer id;

    private String hoTen;

    private String gioiTinh;

    private Date ngaySinh;

    private String dienThoai;

    private String gmail;

    private String cccd;

    private String diaChi;

    private String danToc;

    private String trinhDo;

    private String anh;

    private String password;

    private Integer tongPhep;
}
