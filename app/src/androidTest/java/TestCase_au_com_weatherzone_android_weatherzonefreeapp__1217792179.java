import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_weatherzone_android_weatherzonefreeapp__1217792179 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RecyclerView.class);
      byte var1 = 1;
      ViewCompat.setOverScrollMode((View)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
