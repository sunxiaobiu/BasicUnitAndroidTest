import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artech_mvdportalmovil3_MontevideoPortalAndroid_34951838 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(DragEvent.class);
      ClipDescription var2 = ((DragEvent)var1).getClipDescription();
      CharSequence var3 = var2.getLabel();
   }
}
