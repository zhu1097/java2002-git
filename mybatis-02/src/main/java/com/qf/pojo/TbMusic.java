package qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbMusic implements Serializable {

    private String musicId;

    private String musicName;

    private String musicAlbumName;

    private String musicAlbumPicurl;

    private String musicMp3url;

    private String musicArtistName;

    private Integer sheetId;

}