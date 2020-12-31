import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_moccae_seniar_1381479844 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(CardView.class);
      Object var1 = EasyMock.createMock(Animation.class);
      ((CardView)var2).startAnimation((Animation)var1);
   }
}
