package uk.ac.tees.com2060.froyo.ent_froyo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class listings_data
{
    String itemName;
    Image itemImage;
    Button bidButton;
    String generalLocation;
    String listerName;
    Double listRating;

    public void listingsData(String itemName, Image itemImage, Button bidButton,String generalLocation,
                             String listerName, Double listRating)
    {
        this.itemImage=itemImage;
        this.itemName=itemName;
        this.bidButton=bidButton;
        this.generalLocation=generalLocation;
        this.listerName=listerName;
        this.listRating=listRating;



    }

    public String getItemName()
    {
        return itemName;
    }

    public Button getBidButton()
    {
        return bidButton;
    }

    public String getListerName()
    {
        return listerName;
    }

    public String getGeneralLocation()
    {
        return generalLocation;
    }

    public Image getItemImage(){

        return itemImage;
    }

    public Double getListRating()
    {
        return listRating;
    }

    public Object getName() {
        return listerName;
    }
}
