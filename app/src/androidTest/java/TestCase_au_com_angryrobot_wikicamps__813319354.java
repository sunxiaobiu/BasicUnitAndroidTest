import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_angryrobot_wikicamps__813319354 {
   @Test
   public void testCase() throws Exception {
      Canvas var4 = new Canvas();
      String var1 = "android";
      Object var2 = EasyMock.createMock(Path.class);
      Object var3 = EasyMock.createMock(Paint.class);
      var4.drawTextOnPath(var1, (Path)var2, 0.0F, 3.0F, (Paint)var3);
   }
}
