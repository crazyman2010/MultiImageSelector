package me.nereo.multi_image_selector.adapter;

import me.nereo.multi_image_selector.bean.Image;

/**
 * Created by heyangya on 16-11-21.
 */

public interface ImageAction {
    void onActionSelect(Image image);

    void onActionCapture();
}
