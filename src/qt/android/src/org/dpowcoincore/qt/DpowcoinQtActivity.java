package org.dpowcoincore.qt;

import android.os.Bundle;
import android.system.ErrnoException;
import android.system.Os;

import org.qtproject.qt5.android.bindings.QtActivity;

import java.io.File;

public class DpowcoinQtActivity extends QtActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        final File bitcoinDir = new File(getFilesDir().getAbsolutePath() + "/.dpowcoin");
        if (!bitcoinDir.exists()) {
            bitcoinDir.mkdir();
        }

        super.onCreate(savedInstanceState);
    }
}
