import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_arthurivanets_owly__722912339 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      View var2 = ((View)var1).findViewById(2131296539);
      AppCompatImageView var3 = (AppCompatImageView)var2;
      boolean var4 = var3.isLaidOut();
   }
}
