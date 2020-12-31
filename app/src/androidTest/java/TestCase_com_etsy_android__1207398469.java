import androidx.test.runner.AndroidJUnit4;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_etsy_android__1207398469 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ImageListener.class);
      Object var1 = EasyMock.createMock(ImageContainer.class);
      ((ImageListener)var2).onResponse((ImageContainer)var1, true);
   }
}
