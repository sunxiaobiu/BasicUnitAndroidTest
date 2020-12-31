import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_1923927668 {
   @Test
   public void testCase() throws Exception {
      int var2 = Color.argb(128, 192, 192, 192);
      PaintDrawable var1 = new PaintDrawable(var2);
      var1.setCornerRadius(6.0F);
   }
}
