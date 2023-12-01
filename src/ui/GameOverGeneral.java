package ui;

import java.awt.*;
import java.awt.event.KeyEvent;

import gamestates.Gamestate;
import gamestates.Playing;
import main.Game;

public class GameOverGeneral {

	private Playing playing;


	public void draw(Graphics g) {
		g.setColor(new Color(0, 0, 0, 200));
		g.fillRect(0, 0, Game.GAME_WIDTH, Game.GAME_HEIGHT);

		g.setColor(Color.red);
		Font font = new Font("Impact", Font.BOLD, 48); // Change "Arial" to "Impact" for a more aggressive font
		g.setFont(font);

		String gameOverText = "YOU DIED";
		int textWidth = g.getFontMetrics().stringWidth(gameOverText);
		g.drawString(gameOverText, (Game.GAME_WIDTH - textWidth) / 2, 150);

		String pressAnyKeyText = "Press enter to go back to menu";
		textWidth = g.getFontMetrics().stringWidth(pressAnyKeyText);
		g.drawString(pressAnyKeyText, (Game.GAME_WIDTH - textWidth) / 2, 300);
	}


	public GameOverGeneral(Playing playing) {
		this.playing = playing;
	}




	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			playing.resetAll();
			Gamestate.state = Gamestate.MENU;
		}
	}


//	public void keyPressed(KeyEvent e) {
//		// Check if any key is pressed
//		if (e.getID() == KeyEvent.VK_ENTER) {
//			playing.resetAll();
//			Gamestate.state = Gamestate.MENU;
//		}
//	}

}
