package com.ashok.userui;

import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;

/**
 * Created by ashok on 9/15/16.
 */
public class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {
    @Override
    protected void onBindDescription(AbstractDetailsDescriptionPresenter.ViewHolder viewHolder, Object item) {
        Video video = (Video) item;

        if (video != null) {
            viewHolder.getTitle().setText(video.getTitle());
            viewHolder.getSubtitle().setText(video.getCategory());
            viewHolder.getBody().setText(video.getDescription());
        }
    }
}
