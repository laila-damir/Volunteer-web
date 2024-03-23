import React from "react";
import {
    Form,
    Title,
    Input,
    Button,
    Anchor
} from '../Styles';
import logoImage from "../assets/logo.png";


const SignInPage = ({ toggle }) => {
    return (
        <Form>
            <div style={{position: 'absolute', top: '20px', left: '20px'}}>
                <img src={logoImage} alt="Logo" style={{width: '100px', height: 'auto'}}/>
            </div>
            <Title>Sign in</Title>
            <Input type='email' placeholder='Email'/>
            <Input type='password' placeholder='Password'/>
            <Anchor href='#'>Forgot your password?</Anchor>
            <Button>Sign In</Button>
            <Anchor href='#' onClick={toggle}>Don't have an account? Sign up</Anchor>
        </Form>
    );
}

export default SignInPage;



