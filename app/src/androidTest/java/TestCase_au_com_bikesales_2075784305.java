import android.app.Activity;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_bikesales_2075784305 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(FragmentActivity.class);
      Object var1 = EasyMock.createMock(ViewPager.class);
      ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)var0, (View)var1, "detail_gallery");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
