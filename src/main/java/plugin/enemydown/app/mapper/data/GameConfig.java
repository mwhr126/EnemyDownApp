package plugin.enemydown.app.mapper.data;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
public class GameConfig {

  private int id;
  private int gameTime;
  private String difficulty;
}
