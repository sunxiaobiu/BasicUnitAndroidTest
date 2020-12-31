import android.app.Activity;
import android.app.ActivityOptions;
import android.view.View;
import android.widget.ImageView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_074F13E82635C3305E87CC9D61E0D93927097745759A4EAD77485455B6C329A5_1868585911 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(ImageView.class);
      ActivityOptions.makeSceneTransitionAnimation((Activity)var0, (View)var1, "ContaActivity:image");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
