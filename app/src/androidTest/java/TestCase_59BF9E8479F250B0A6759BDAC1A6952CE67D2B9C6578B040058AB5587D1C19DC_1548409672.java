import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59BF9E8479F250B0A6759BDAC1A6952CE67D2B9C6578B040058AB5587D1C19DC_1548409672 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      ActionBarContainer var3 = (ActionBarContainer)var2;
      Object var1 = EasyMock.createMock(Drawable.class);
      var3.setPrimaryBackground((Drawable)var1);
   }
}
