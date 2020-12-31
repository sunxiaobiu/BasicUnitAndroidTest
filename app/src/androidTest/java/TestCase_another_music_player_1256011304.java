import android.graphics.Paint;
import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player_1256011304 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Paint.class);
      char[] var1 = new char[1];
      Object var2 = EasyMock.createMock(Rect.class);
      ((Paint)var3).getTextBounds(var1, 0, 1, (Rect)var2);
   }
}
