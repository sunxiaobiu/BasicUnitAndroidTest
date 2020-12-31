import android.app.Activity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.core.util.Pair;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_301E5A79FCE63B81B6DF72AF8465BE1A9F695A13F59C117EF197311684F59CDC__1942446655 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Object var1 = EasyMock.createMock(Pair[].class);
      ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)var0, (Pair[])var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
