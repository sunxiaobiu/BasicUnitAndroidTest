import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player__1215463206 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(FragmentManager.class);
      Fragment var2 = ((FragmentManager)var1).findFragmentByTag("[MD_COLOR_CHOOSER]");
      DialogFragment var3 = (DialogFragment)var2;
      var3.dismiss();
   }
}
