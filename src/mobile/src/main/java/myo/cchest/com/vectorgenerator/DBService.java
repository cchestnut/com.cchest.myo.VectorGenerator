package myo.cchest.com.vectorgenerator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DBService extends Service {
    public DBService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
