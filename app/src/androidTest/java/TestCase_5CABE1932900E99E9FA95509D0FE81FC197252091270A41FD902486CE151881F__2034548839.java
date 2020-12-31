import android.app.ActivityOptions;
import android.graphics.Bitmap;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5CABE1932900E99E9FA95509D0FE81FC197252091270A41FD902486CE151881F__2034548839 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      Object var1 = EasyMock.createMock(Bitmap.class);
      ActivityOptions.makeThumbnailScaleUpAnimation((View)var0, (Bitmap)var1, 0, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
