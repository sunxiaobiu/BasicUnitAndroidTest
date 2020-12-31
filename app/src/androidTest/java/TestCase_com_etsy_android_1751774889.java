import androidx.test.runner.AndroidJUnit4;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_etsy_android_1751774889 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ImageContainer.class);
      String var2 = ((ImageContainer)var1).getRequestUrl();
   }
}
