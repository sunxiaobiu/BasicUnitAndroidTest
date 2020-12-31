import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5997CA36C31CAA68B33B8238A822E7BFA82E3A405EF116ADFF70DA2F98F11BBE_1238463942 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      Object var1 = EasyMock.createMock(ColorStateList.class);
      DrawableCompat.setTintList((Drawable)var0, (ColorStateList)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
