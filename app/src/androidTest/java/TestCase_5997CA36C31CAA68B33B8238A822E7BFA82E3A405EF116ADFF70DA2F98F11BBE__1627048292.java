import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5997CA36C31CAA68B33B8238A822E7BFA82E3A405EF116ADFF70DA2F98F11BBE__1627048292 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Drawable.class);
      RippleDrawable var3 = (RippleDrawable)var2;
      Object var1 = EasyMock.createMock(ColorStateList.class);
      var3.setColor((ColorStateList)var1);
   }
}
