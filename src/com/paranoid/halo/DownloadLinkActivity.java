package com.paranoid.halo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.PreferenceManager;

public class DownloadLinkActivity extends PreferenceActivity {

    Preference Paranoid;
    Preference Crom;
    Preference Carbon;
    Preference RootBox;
    Preference uXylon;
    Preference SaberMod;
    Preference PacMan;

    @SuppressWarnings("deprecation")
    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.downloadlink);

        Paranoid = findPreference("paranoid");
        Crom = findPreference("crom");
        Carbon = findPreference("carbon");
        RootBox = findPreference("rootbox");
        uXylon = findPreference("uxylon");
        SaberMod = findPreference("sabermod");
        PacMan = findPreference("pacman");

    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if (preference == Paranoid) {
            launchUrl("http://goo.im/devs/paranoidandroid/roms");
        } else if (preference == Crom) {
            launchUrl("http://www.xdafileserver.nl/aways/c-rom/");
        } else if (preference == Carbon) {
            launchUrl("http://goo.im/devs/carbon");
        } else if (preference == RootBox) {
            launchUrl("http://get.rootbox.ca/");
        } else if (preference == uXylon) {
            launchUrl("http://ultimatumdev.org/downloads/");
        } else if (preference == SaberMod) {
            launchUrl("http://goo.gl/3ADKw");
        } else if (preference == PacMan) {
            launchUrl("http://pacman.basketbuild.com/index.php?dir=main/");
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }
        
    private void launchUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent download = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(download);
    }
}
