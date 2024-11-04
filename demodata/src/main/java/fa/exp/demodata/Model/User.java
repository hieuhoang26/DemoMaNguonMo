package fa.exp.demodata.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "HoTen", nullable = true )
    private String hoTen;
    @Basic
    @Column(name = "GioiTinh", nullable = true )
    private String gioiTinh;
    @Basic
    @Column(name = "NgaySinh", nullable = true)
    private Date ngaySinh;
    @Basic
    @Column(name = "DienThoai", nullable = true)
    private String dienThoai;
    @Basic
    @Column(name = "Gmail", nullable = true )
    private String gmail;
    @Basic
    @Column(name = "CCCD", nullable = true )
    private String cccd;
    @Basic
    @Column(name = "DiaChi", nullable = true)
    private String diaChi;
    @Basic
    @Column(name = "DanToc", nullable = true )
    private String danToc;
    @Basic
    @Column(name = "TrinhDo", nullable = true )
    private String trinhDo;
    @Basic
    @Column(name = "Anh", nullable = true)
    private String anh;
    @Basic
    @Column(name = "Password", nullable = true)
    private String password;
    @Column(name = "TongPhep", nullable = true)
    private Integer tongPhep;
}
