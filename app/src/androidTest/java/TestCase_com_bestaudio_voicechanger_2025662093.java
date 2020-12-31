import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bestaudio_voicechanger_2025662093 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Canvas.class);
      Object var1 = EasyMock.createMock(Picture.class);
      ((Canvas)var2).drawPicture((Picture)var1);
   }
}
