package com.leeway.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.leeway.liveat500px.dao.PhotoItemCollectionDao;
import com.leeway.liveat500px.dao.PhotoItemDao;
import com.leeway.liveat500px.manager.PhotoListManager;
import com.leeway.liveat500px.view.PhotoListItem;

/**
 * Created by Lee Lorz on 1/14/2017.
 */

public class PhotoListAdapter extends BaseAdapter {

    PhotoItemCollectionDao dao;

    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

    @Override
    public int getCount() {
        if (dao == null)
            return 0;
        if (dao.getData() == null)
            return 0;
        return dao.getData().size();
    }

    @Override
    public Object getItem(int i) {
        return dao.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /*
    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? 0 : 1;
    }
    */

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //if (getItemViewType(i) == 0) {
        PhotoListItem item;
        if (view != null) {
            item = (PhotoListItem) view;
        } else {
            item = new PhotoListItem(viewGroup.getContext());
        }

        PhotoItemDao dao = (PhotoItemDao) getItem(i);
        item.setNameText(dao.getCaption());
        item.setTvDescriptionText(dao.getUsername() + "\n" + dao.getCamera());
        item.setImageUrl(dao.getImageUrl());

        return item;

            /*
        } else {
            TextView item;
            if (view != null) {
                item = (TextView) view;
            } else {
                item = new TextView(viewGroup.getContext());
            }
            item.setText("Position : " + i);
            return item;
        }
        */
    }
}
