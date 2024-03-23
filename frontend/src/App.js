import React, { useState } from "react";
import {
    GhostButton,
    LeftOverlayPanel,
    Overlay,
    OverlayContainer,
    Paragraph, RightOverlayPanel,
    SignInContainer,
    SignUpContainer,
    Title
} from "./Styles";
import SignInPage from "./Components/SignInPage";
import SignUpPage from "./Components/SignUpPage";

function App() {
    const [signIn, setSignIn] = useState(true);

    const handleSignUpClick = () => {
        setSignIn(false);
    };

    const handleSignInClick = () => {
        setSignIn(true);
    };

    return (
        <>
            <SignUpContainer signinIn={signIn}>
                <SignUpPage toggle={handleSignInClick}/>
            </SignUpContainer>
            <SignInContainer signinIn={signIn}>
                <SignInPage toggle={handleSignUpClick}/>
            </SignInContainer>
            <OverlayContainer signinIn={signIn}>
                <Overlay signinIn={signIn}>
                    <LeftOverlayPanel signinIn={signIn}>
                        <Title>Welcome Back!</Title>
                        <Paragraph>
                            To keep connected with us please login with your personal info
                        </Paragraph>
                        <GhostButton onClick={handleSignInClick}>
                            Sign In
                        </GhostButton>
                    </LeftOverlayPanel>
                    <RightOverlayPanel signinIn={signIn}>
                        <Title>Hello, Friend!</Title>
                        <Paragraph>
                            Enter Your personal details and start volunteering!
                        </Paragraph>
                        <GhostButton onClick={handleSignUpClick}>
                            Sign Up
                        </GhostButton>
                    </RightOverlayPanel>
                </Overlay>
            </OverlayContainer>
        </>
    );
}

export default App;



