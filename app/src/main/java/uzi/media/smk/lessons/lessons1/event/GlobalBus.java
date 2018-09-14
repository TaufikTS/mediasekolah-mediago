package uzi.media.smk.lessons.lessons1.event;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by fauzi sholichin on 30/12/17.
 * Email : fauzisholichin@gmail.com
 */

public class GlobalBus {
    private static EventBus sBus;
    public static EventBus getBus() {
        if (sBus == null)
            sBus = EventBus.getDefault();
        return sBus;
    }
}
