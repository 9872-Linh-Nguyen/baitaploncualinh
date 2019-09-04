package com.linhnguyen.baitaploncualinh.UI.Profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.linhnguyen.baitaploncualinh.Model.ProfileModel;
import com.linhnguyen.baitaploncualinh.R;

import java.util.List;

public class ProfileAdapter extends BaseAdapter {
    private List<ProfileModel> list;
    private Context context;
    private LayoutInflater inflater;
    private int resource;

    public ProfileAdapter( Context context,  int resource, List<ProfileModel> list) {
        this.list = list;
        this.context = context;
        this.resource = resource;
        this.inflater = inflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder vh = new ViewHolder();
        if (view == null){
            view = inflater.inflate(resource, viewGroup, false);
            vh.item_image = view.findViewById(R.id.item_image);
            view.setTag(vh);
        }else{
            vh = (ViewHolder) view.getTag();
        }
        vh.item_image.setImageResource(list.get(i).getImage());
        return view;
    }
    class ViewHolder{
        private ImageView item_image;

    }
}
