import android.app.Activity;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_08C7128379FFE7EBFDF0832254E676EEB2F0E19B5063D130A94D3857F0FC23B0_1406389446 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(View.class);
      ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)var0, (View)var1, "CELEBRATION");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
