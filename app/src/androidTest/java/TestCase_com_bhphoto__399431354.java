import android.graphics.Rect;
import android.support.design.widget.FloatingActionButton;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bhphoto__399431354 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(FloatingActionButton.class);
      Object var1 = EasyMock.createMock(Rect.class);
      ((FloatingActionButton)var2).getDrawingRect((Rect)var1);
   }
}
