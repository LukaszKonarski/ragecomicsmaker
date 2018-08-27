package pl.koziolekweb.ragecomicsmaker.event;

import com.google.common.eventbus.Subscribe;

public interface CropImageEventListener {

    @Subscribe
    void handleCropImageEvent(CropImageEvent event);
}
