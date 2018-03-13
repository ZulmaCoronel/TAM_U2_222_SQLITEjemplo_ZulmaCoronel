package mx.edu.ittepic.tam_u2_222_sqlitejemplo_zulmacoronel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Vista {
    private String title;
    private String description;

    public Vista(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
