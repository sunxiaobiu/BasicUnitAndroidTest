import android.transition.Slide;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_buzzfeed_news__1689242367 {
   @Test
   public void testCase() throws Exception {
      Slide var2 = new Slide(80);
      Object var1 = EasyMock.createMock(View.class);
      var2.addTarget((View)var1);
   }
}
