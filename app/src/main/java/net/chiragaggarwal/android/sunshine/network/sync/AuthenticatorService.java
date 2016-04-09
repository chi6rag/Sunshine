package net.chiragaggarwal.android.sunshine.network.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

// AuthenticatorService communicates to OpenWeatherMap via Authenticator
// to provide secure data access to app components

public class AuthenticatorService extends Service {

    private Authenticator authenticator;

    @Override
    public void onCreate() {
        super.onCreate();
        this.authenticator = new Authenticator(this);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return this.authenticator.getIBinder();
    }
}
