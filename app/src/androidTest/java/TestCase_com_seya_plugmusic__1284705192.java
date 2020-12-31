import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_seya_plugmusic__1284705192 {
   @Test
   public void testCase() throws Exception {
      int var2 = Color.rgb(25, 68, 112);
      PaintDrawable var1 = new PaintDrawable(var2);
      var1.setDither(true);
   }
}
