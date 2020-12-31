import android.content.res.ColorStateList;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.Spinner;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_opal_travel_2083354200 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Spinner.class);
      Object var1 = EasyMock.createMock(ColorStateList.class);
      ViewCompat.setBackgroundTintList((View)var0, (ColorStateList)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
