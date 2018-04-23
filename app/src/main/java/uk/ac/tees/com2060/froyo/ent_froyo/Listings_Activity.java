package uk.ac.tees.com2060.froyo.ent_froyo;

import android.content.Context;
import android.provider.Contacts;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Listings_Activity extends ArrayAdapter<listings_data> implements View.OnClickListener {

    private ArrayList<listings_data> dataSet;
    Context mContext;



    public Listings_Activity(ArrayList<listings_data> data, Context context) {
        super(context, R.layout.activity_listings_, data);
        this.dataSet = data;
        this.mContext=context;

    }
    @Override
    public void onClick(View v)
    {
        int position=(Integer) v.getTag();
        Object object=getItem(position);
        listings_data data=(listings_data)object;



    }
    private int lastPosition = -1;


    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        listings_data dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        RecyclerView.ViewHolder viewHolder = null; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {


            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_listings_, parent, false);


            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (RecyclerView.ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.down_scroll: R.anim.up_scroll);
        result.startAnimation(animation);
        lastPosition = position;



        // Return the completed view to render on screen
        return convertView;
    }
}
