package config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import videosystem.Avengers;
import videosystem.BlankDisc;
import videosystem.DVDPlayer;
import videosystem.DigitalVideoDisc;
import videosystem.IronMan;

@Configuration
@Import({ DVDConfig.class, DVDPlayerConfig.class })
public class VideoSystemConfig {

}
