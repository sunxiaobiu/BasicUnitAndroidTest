import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player_759832826 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(Canvas.class);
      char[] var1 = new char[1];
      float var2 = 1.0F;
      float var3 = 1.0F;
      Object var4 = EasyMock.createMock(Paint.class);
      ((Canvas)var5).drawText(var1, 0, 1, var2, var3, (Paint)var4);
   }
}
